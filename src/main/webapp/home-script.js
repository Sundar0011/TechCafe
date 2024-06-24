function Login()
{
    document.getElementById("login").style.display='block';
    document.getElementById("signup").style.display='none';
    document.getElementById("verify").style.display='none';
}
function signup()
{
    document.getElementById("login").style.display='none';
    document.getElementById("signup").style.display='block';
    document.getElementById("verify").style.display='none';
}
function verify()
{
    document.getElementById("login").style.display='none';
    document.getElementById("signup").style.display='none';
    document.getElementById("verify").style.display='block';

}