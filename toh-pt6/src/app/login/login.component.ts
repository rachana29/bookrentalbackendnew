import {Component, OnInit} from '@angular/core';
import {LoginInfo} from './login.model';
import {FormBuilder, FormControl, FormGroup} from '@angular/forms';
import {Http, Response} from '@angular/http';
import 'rxjs/add/operator/map';

@Component({
      selector: 'app-login-form',
      templateUrl: './login.component.html'
})


export class LoginComponent implements OnInit {
  public loginInfo: LoginInfo = new LoginInfo();
    loginForm: FormGroup;
  values: any;
  Fail= false;
  Pass= false;
  Status: any;
  constructor(private _formBuilder: FormBuilder, private _http: Http) { }
  ngOnInit() {
    this.loginForm = this._formBuilder.group({
        email_id  :  [],
        password : []
    });
    console.log(this.loginForm);
  }
  public login() {
    console.log(this.loginForm.value);

    this._http.post('http://localhost:8080/rentalbook/user/addUserRole', this.loginForm.value)
      .map((response: Response) => response.json()).subscribe(status => {
        this.Status = status;
        console.log('====>>login Response : ', status);
        if ( this.Status == true) {
            console.log("valid user");
            this.Pass = true;
            this.Fail = false;
        } else {
            console.log("invalid user");
            this.Fail = true;
            this.Pass = false;
        }
      });

  }
}
