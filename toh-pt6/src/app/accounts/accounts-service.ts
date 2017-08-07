///<reference path="../../../node_modules/rxjs/add/operator/toPromise.d.ts"/>
import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';
@Injectable()
export class AccountsService {

    constructor(private  http: Http) {

    }

    /*public resetPassword(data: any): Promise<Response> {
        return this.http.put('/usersrvcs/rest/1.0/accounts/password/reset/', data).toPromise();
    }

    public currentUserDetails(): Promise<Response> {
        return this.http.get('/usersrvcs/rest/1.0/users/current-user').toPromise();
    }*/


}
