import {Component, OnInit} from '@angular/core';

@Component({
    moduleId: module.id,
    selector: 'reset-password',
    templateUrl: 'password-reset.html'
})
export class PasswordResetComponent implements OnInit {
    ngOnInit(): void {
    }
    public title: string = "Password Reset Instructions"


}

