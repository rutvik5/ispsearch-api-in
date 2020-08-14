import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './pages/home/home.component';
import { ProviderComponent } from './pages/provider/provider.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'provider', component: ProviderComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
