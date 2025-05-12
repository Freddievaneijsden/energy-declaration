import { Component } from '@angular/core';
import { RouterModule, RouterOutlet } from '@angular/router';
import { DarkModeSwitchModule } from './components/dark-mode-switch/dark-mode-switch.module';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatListModule} from '@angular/material/list';
import { MaterialModule } from './material/material.module';

export interface Route {
  path: string;
  name: string;
  icon: string;
}

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, RouterModule, DarkModeSwitchModule, MaterialModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  routes: Route[] = [{ path :'home', name: 'Home', icon: 'home'}, { path :'form', name: 'Form', icon: 'form'}]
  title = 'app-frontend';

}
