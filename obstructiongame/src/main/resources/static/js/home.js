function startGame() {
	$.ajax({
		url: "http://localhost:8080/api/start",
		method: "POST",
		success: function (game) {
			console.log(game);
			let message = "<span> " + game + " </span>";
			$("#results").empty();
			$("#results").append(message);
		},
		error: function (a, b, c) {
			console.log(a);
		},
	});
}
