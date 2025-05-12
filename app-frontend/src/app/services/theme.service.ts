import { DOCUMENT } from '@angular/common';
import { inject, Injectable, signal } from '@angular/core';

export type Theme = 'light' | 'dark';

@Injectable({
  providedIn: 'root'
})
export class ThemeService {

  private readonly document = inject(DOCUMENT)
  private readonly currentTheme = signal<Theme>('light');

  constructor() { 
    this.setTheme(this.getThemeInLocalStorage());
  }
  
  toggleTheme() {
    if (this.currentTheme() === 'light') {
      this.setTheme('dark');
    } else {
      this.setTheme('light');
    }
  }

  setTheme(theme: Theme) {
    this.document.documentElement.classList.remove(`${this.currentTheme()}-theme`);
    this.document.documentElement.classList.add(`${theme}-theme`);
    this.currentTheme.set(theme);
    this.setThemeInLocalStorage(theme);
  }

  setThemeInLocalStorage(theme: Theme) {
    localStorage.setItem('preffered-theme', theme);
  }


  getThemeInLocalStorage(): Theme {
    return localStorage.getItem('preffered-theme') as Theme ?? 'light';
  }

  isDarkChecked() {
    return this.currentTheme() === 'dark';
  }
}
