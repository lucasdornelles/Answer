function submitQuestion() {
    var question = document.getElementById('questionInput').value;
    fetch('answer', {
        method: 'POST',
        body: question
    }).then(function(response) {
        return response.text();
    }).then(function(text) {
        document.getElementById('answer').innerHTML = text;
    })
}
