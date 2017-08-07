import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
@Component({
    moduleId: module.id,
    selector: 'navbar',
    templateUrl: 'navbar.component.html',
})
export class NavBarComponent implements OnInit {
    public currentUser: any = {
        firstName: 'Admin',
        lastName: 'Admin'
    };

    constructor(private router: Router) {

    }

    ngOnInit(): void {
    }

    public logout(): void {
        console.log('user Logged out');
        this.router.navigate(["/login"])
    }

}
