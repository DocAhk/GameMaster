import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DiceRollComponent } from './dice-roll/dice-roll.component';

const routes: Routes = [
  {path: 'diceRoll', component: DiceRollComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
