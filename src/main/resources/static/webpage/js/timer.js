var timeleft = 10;
var timer = setInterval(() => {
  if (timeleft === 1) {
    clearInterval(timer);
  }
  timeleft -= 1;
  document.getElementById(
    "timer"
  ).innerHTML = `You will be automatically redirected to the application webpage in ${timeleft} seconds`;
}, 1000);
