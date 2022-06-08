var searchFunction = document.getElementById("searchButton");

searchFunction.addEventListener("click",()=>{   //addEventListener(이벤트 방식, 펑션)
    let searchBox = document.getElementById("searchBox").value; //검색창의 밸류 값을 받아온다
    document.getElementById("inner").innerHTML=searchBox; //div inner의 위치에 검색창의 밸류 값을 출력

});