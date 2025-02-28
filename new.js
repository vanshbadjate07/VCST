const name = document.getElementById('UserName');
const num = document.getElementById('PhNo');
const mail = document.getElementById('EmailId');
const place = document.getElementById('loc');
const error = document.getElementById('error');
const para = document.getElementById('para');
const btn = document.getElementById('Btn');

const details = document.getElementsByClassName('details');

btn.addEventListener('click', e => {
    if (name.value === '' || num.value === '' || mail.value === '' || place.value === '') {
        error.style.display = 'block';
        setTimeout(() => {
            error.style.display = 'none';
        }, 3000);
    } else if (num.value.length < 10) {
        error.style.display = 'block';
        para.innerHTML = "Enter Valid Number!!";
        setTimeout(() => {
            error.style.display = 'none';
        }, 3000);
    } else {
        details[0].style.display = 'block';
        const p = document.createElement('p');
        p.innerHTML = `Name: ${name.value} <br> 
                       Phone: ${num.value} <br> 
                       Email-Id: ${mail.value} <br> 
                       Place: ${place.value}
                       <br><hr><br>`;
                       
        details[0].appendChild(p);

        name.value='';
        num.value='';
        mail.value='';
        place.value='';
    }
});
