import {Component, OnInit} from '@angular/core';
import {LoginInfo} from './login.model';
import {FormBuilder, FormControl, FormGroup} from '@angular/forms';
import {Http, Response} from '@angular/http';
import {RegisterService} from './register.service';
import 'rxjs/add/operator/map';

@Component({
    selector: 'register',
    templateUrl: './register.component.html'
})

export class RegisterComponent {
    response: any;

    constructor(private registerService: RegisterService, private router: Router) {
    }
export class registerComponent {
    public loginInfo: LoginInfo = new LoginInfo();
    loginForm: FormGroup;
    values: any;
    Fail= false;
    Pass= false;
    Status: any;
    constructor(private _formBuilder: FormBuilder, private _http: Http) { }
    ngOnInit() {
        this.registerForm = this._formBuilder.group({
            email_id  :  [],
            password : []
        });
        console.log(this.registerForm);
    }
    public login() {
        console.log(this.registerForm.value);

        this._http.post('http://localhost:8080/rentalbook/user/addUser', this.registerForm.value)
            .map((response: Response) => response.json()).subscribe(status => {
    }
}



/*

import { Component } from '@angular/core';
import {RegisterService} from './register.service';
import {Router} from '@angular/router';
import {HttpModule} from '@angular/http';

@Component({
    selector: 'register',
    templateUrl: './register.component.html'
})
export class RegisterComponent {
    response: any;

    constructor(private registerService: RegisterService, private router: Router) {
    }

    onSubmit(value: any) {
        console.log(value);
        console.log('Submitted form');
        let signupData = {
            'user_id': value.user_id,
            'user_name': value.username,
            'password': value.password,
            'user_type': value.user_type,
            'email_id': value.email,
            'mobile_no': value.mobile_no,
        };
        console.log(signupData);
        this.registerService.signupValues(signupData).then((response) => {
            console.log(response.json());
        }).catch((error) => {
            console.log(error);
        });

    }
}
