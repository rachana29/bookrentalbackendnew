import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';
import {AppComponent} from './app.component';
import {CommonModule} from '@angular/common';
import {RouterModule} from '@angular/router';
import {HomeComponent} from './home/home.component';
import {LoginComponent} from './login/login.component';
import {RegisterComponent} from './register/register.component';
import {RegisterModule} from './register/register.module';
//import {ControlGroup} from './angular2/common';


@NgModule({
    imports: [
        CommonModule,
        BrowserModule,
        FormsModule,
        HttpModule,
        RegisterModule,
        ReactiveFormsModule,

        RouterModule.forRoot([{
            path: '',
            redirectTo: '/login',
            pathMatch : 'full'
        } ,
            {
          path: 'login',
          component: LoginComponent
        },
            {
                path: 'register',
                component: RegisterComponent
            }
            ] ),
    ],
    declarations: [
        AppComponent,
        HomeComponent,
        LoginComponent,
        RegisterComponent
    ],
    bootstrap: [AppComponent]
    // exports :[RouterModule]
})
export class AppModule {
}
