import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {AccountsService} from './accounts-service';
import {PasswordResetComponent} from './password-reset/password-reset.component';
import {RouterModule} from '@angular/router';
import {EditProfileComponent} from './edit-profile/edit-profile.component';
@NgModule({
    imports: [CommonModule,
        FormsModule,
        ReactiveFormsModule,
        RouterModule.forChild([
            {
                path: 'password-reset',
                component: PasswordResetComponent
            },
            {
                path: 'edit-profile',
                component: EditProfileComponent
            }
        ])
    ],
    exports: [PasswordResetComponent,
        RouterModule],
    declarations: [PasswordResetComponent,
        EditProfileComponent],
    providers: [AccountsService]
})
export class AccountModule {

}
