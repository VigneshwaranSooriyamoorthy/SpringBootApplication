function processUserInformation() {
  postUserInformation().then((id) => {
    if (id) {
      resetPage();
      updateSummary(id);
    }
  });
}

async function postUserInformation() {
  let firstName = document.getElementById("fname").value;
  let lastName = document.getElementById("lname").value;
  let email = document.getElementById("email").value;
  let address = document.getElementById("address").value;
  
  if (!(firstName && lastName && email && address)) {
    alert("Make sure all fields are filled");
    return 0;
  } else {
    return fetch("http://localhost:8080/new-user", {
      method: "POST",
      body: JSON.stringify({
        fname: firstName,
        lname: lastName,
        email: email,
        address: address,
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8",
      },
    })
      .then((response) => response.json())
      .then((json) => json.id);
  }
}

function updateSummary(id) {
  fetch(`http://localhost:8080/users/${id}`, {
    method: "GET",
  })
    .then((response) => response.json())
    .then((json) => {
      document.getElementById("summary-fname").innerHTML = json.fname;
      document.getElementById("summary-lname").innerHTML = json.lname;
      document.getElementById("summary-email").innerHTML = json.email;
      document.getElementById("summary-address").innerHTML = json.address;
    });
}

function resetPage() {
  document.getElementById("fname").value = "";
  document.getElementById("lname").value = "";
  document.getElementById("email").value = "";
  document.getElementById("address").value = "";
}
