function handleOpacity(opOne,opZero1,opZero2,opZero3) {
    opOne.style.handleOpacity = 1;
    opZero1.style.handleOpacity = 0;
    opZero2.style.handleOpacity = 0;
    opZero3.style.handleOpacity = 0;        
}

function handleAni() {
    for(let i=0; i<arguments.length; i++){
        arguments[i].classList.remove('main-animation')
        arguments[i].offsetWidth;
        arguments[i].classList.add('main-animation');
    }    
}
