import { AfterViewInit, Component, ElementRef, inject, input, Input, Renderer2, signal, viewChild, ViewChild } from '@angular/core';
import { ThemeService } from '../../services/theme.service';
import { MatIconRegistry } from '@angular/material/icon';
import { DomSanitizer } from '@angular/platform-browser';

@Component({
  selector: 'app-dark-mode-switch',
  standalone: false,
  templateUrl: './dark-mode-switch.component.html',
  styleUrl: './dark-mode-switch.component.scss'
})
export class DarkModeSwitchComponent implements AfterViewInit {
  constructor(private renderer: Renderer2, private iconRegistry: MatIconRegistry, private sanitizer: DomSanitizer) {
    this.iconRegistry.addSvgIcon(
      'custom-on-icon',
      this.sanitizer.bypassSecurityTrustResourceUrl('assets/icons/dark_mode.svg') // Replace with your path
    );
    this.iconRegistry.addSvgIcon(
      'custom-off-icon',
      this.sanitizer.bypassSecurityTrustResourceUrl('assets/icons/light_mode.svg') // Replace with your path
    );
    this.isDarkMode.set(this.themeService.isDarkChecked());

    
  }
  readonly themeService = inject(ThemeService);

  element = viewChild<ElementRef>("darkModeSwitch");

  disabled = input<boolean>(false);
  checked = signal<boolean>(false);
  isDarkMode = signal<boolean>(false);

  ngAfterViewInit() {
    this.setIcon();
  }

  setIcon() {
    if (this.element) {
      const targetSpan: HTMLElement = this.element()?.nativeElement.querySelector('.mdc-switch__icons');
      while (targetSpan.firstChild) {
        targetSpan.firstChild.remove();
      }
      const elem = this.renderer.createElement('mat-icon');
      const icon = this.themeService.isDarkChecked() ? 'dark_mode' : 'light_mode';
      elem.setAttribute('class', 'mat-icon notranslate material-icons mat-icon-no-color light-mode-switch-icon');
      elem.textContent = icon
      targetSpan.appendChild(elem);
    }
  }

  changeTheme() {
    this.themeService.toggleTheme();
    this.isDarkMode.set(this.themeService.isDarkChecked());

  }
}
