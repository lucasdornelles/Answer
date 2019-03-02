function submitQuestion() {
    var question = document.getElementById('questionInput').value;
    const Http = new XMLHttpRequest();
    var url ='answer?question='+question;
    Http.onreadystatechange = function() {
	if (this.readyState == 4 && this.status == 200){
	    document.getElementById('answer').innerHTML = this.responseText;
    	}
    }
    Http.open('GET',url,true);
    Http.send(null);
}
