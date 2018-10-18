/**
 * 编写E-mail注册的表单的验证代码。包括内容：邮箱名称（长度6到10位，不能为空）、密码、确认密码（两个密码必须相同且不能为空）、
 * 来自城市、爱好、性别、个人介绍，以及确认与重置按钮。
 */
function emailValidate(form) {
    if (nullValueValidate(form.email) || nullValueValidate(form.password) || nullValueValidate(form.confirmPassword) ||
        nullValueValidate(form.city) || nullValueValidate(form.hobby) || nullValueValidate(form.selfIntro) ||
        nullValueValidate(form.confirmButton) || nullValueValidate(form.resetButton)) {
        return false;
    }
    if (form.email.length < 6 || form.email.length > 10) {
        alert("email error");
        form.email.focus();
        return false;
    }

    if (form.password.value !== form.confirmPassword.value) {
        alert("password not same");
        form.password.focus();
        form.confirmPassword.focus();
        return false;
    }
}

function nullValueValidate(item) {
    if (item == null || item === "") {
        alert("null value exists");
        return false;
    }
}

