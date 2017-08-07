/**
 * Created by ankitp on 16/4/17.
 */
import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterModule} from '@angular/router';
import {TeamComponent} from "./team.component";
import {UserComponent} from "./user/user.component";
import {UserGroupComponent} from "./user-group/user-group.component";
import {UserRoleComponent} from "./user-role/user-role.component";
@NgModule({
    imports: [CommonModule,
        RouterModule.forChild([])
    ],
    declarations: [TeamComponent, UserComponent,UserGroupComponent,UserRoleComponent
    ],
    providers: [],
    exports: []
})

export class TeamModule {

}
