
import {Injectable} from '@angular/core';
import {Http} from '@angular/http';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';
@Injectable()
export class RegisterService {

    constructor(private http: Http) {
    }

    signupValues(signupData: any) {
        event.preventDefault();
        return this.http.post('http://localhost:8080/rentalbook/user/addUserRole', signupData).toPromise();
        // return console.log(logindata);
    }
}