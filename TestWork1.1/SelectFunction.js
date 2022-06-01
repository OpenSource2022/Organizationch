function categoryChange1(e) {
    const test2 = document.getElementById("test2");
  
    const testOption1 = ["a1","b1","c1","d1"]; //두 번째 셀렉트 박스에 사용할 옵션값들의 배열들
    const testOption2 = ["a2","b2","c2","d2"];
    const testOption3 = ["a3","b3","c3","d3"];
    const testOption4 = ["a4","b4","c4","d4"];
    const testOption5 = ["a5","b5","c5","d5"];
    const testOption6 = ["a6","b6","c6","d6"];
    
  
    if (e.value == "firstTest1") { //html 파일에서 참조해온 value 값
      add = testOption1; //조건문이 참일 경우 지정된 배열을 add?
    } else if (e.value == "firstTest2") {
      add = testOption2;
    } else if (e.value == "firstTest3") {
      add = testOption3;
    } else if (e.value == "firstTest4") {
      add = testOption4;
    } else if (e.value == "firstTest5") {
      add = testOption5;
    } else if (e.value == "firstTest6") {
      add = testOption6;
    }
  
    test2.options.length = 1;
  
      for (property in add) {
          let opt = document.createElement("option");
          opt.value = add[property];
          opt.innerHTML = add[property];
          test2.appendChild(opt);
      }
  }