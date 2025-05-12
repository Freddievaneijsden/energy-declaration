import { ThemeService } from './../../services/theme.service';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DarkModeSwitchComponent } from './dark-mode-switch.component';
import { MatSlideToggleModule } from '@angular/material/slide-toggle';
import { MatIconModule } from '@angular/material/icon';



@NgModule({
  declarations: [DarkModeSwitchComponent],
  imports: [
    CommonModule,
    MatSlideToggleModule,
    MatIconModule
  ],
  exports: [DarkModeSwitchComponent],
  providers: [ThemeService],
})
export class DarkModeSwitchModule { }
