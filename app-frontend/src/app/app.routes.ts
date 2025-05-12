import { Routes } from '@angular/router';

export const routes: Routes = [{
  path: '',
  redirectTo: 'form',
  pathMatch: 'full'
}, {
    path: 'form',
    loadChildren: () => import('./form/form.module').then(m => m.FormModule)
}];
