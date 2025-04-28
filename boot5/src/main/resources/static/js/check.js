function checkform() {
    if (form1.username.value.length < 1 || form1.username.value.length > 15) {
        alert("请输入正确的用户名！");
        form1.userusernameid.focus();
        return false;
    }
    if (form1.password.value.length < 1 || form1.password.value.length > 15) {
        alert("请输入正确的密码!");
        form1.password.focus();
        return false;
    }
    return true;

    if (form1.uploadFile.value.length <1 ) {
        alert("请上传一张图片!");
        form1.uploadFile.focus();
        return false;
    }
    return true;
}

