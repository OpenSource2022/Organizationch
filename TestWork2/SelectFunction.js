$("#test1").on("change", function(){ //test1에서 변화가 있을 시 사용되는 펑션
  $("#test2 option").hide(); //test2 셀렉트 박스의 모든 옵션을 숨김 처리
  if($(this).val() == "firstTest1"){ //test1의 변화 값이 firstTest1일 경우
    $("#test2 option[value = 211]").show(); //test2 해당 밸류값의 옵션들을 보이게 처리
    $("#test2 option[value = 212]").show();
    $("#test2 option[value = 213]").show();
    $("#test2 option[value = 214]").show();
  } else if($(this).val() == "firstTest2"){
    $("#test2 option[value = 221]").show();
    $("#test2 option[value = 222]").show();
    $("#test2 option[value = 223]").show();
    $("#test2 option[value = 224]").show();
  } else if($(this).val() == "firstTest3"){
    $("#test2 option[value = 231]").show();
    $("#test2 option[value = 232]").show();
    $("#test2 option[value = 233]").show();
    $("#test2 option[value = 234]").show();
  } else if($(this).val() == "firstTest4"){
    $("#test2 option[value = 241]").show();
    $("#test2 option[value = 242]").show();
    $("#test2 option[value = 243]").show();
    $("#test2 option[value = 244]").show();
  }
});

$("#test2").on("change", function(){
  $("#test3 option").hide();
  if($(this).val() == "211"){
    $("#test3 option[value = 3111]").show();
    $("#test3 option[value = 3112]").show();
  } else if($(this).val() == "212"){
    $("#test3 option[value = 3121]").show();
    $("#test3 option[value = 3122]").show();
  } else if($(this).val() == "221"){
    $("#test3 option[value = 3211]").show();
    $("#test3 option[value = 3212]").show();
  } else if($(this).val() == "222"){
    $("#test3 option[value = 3221]").show();
    $("#test3 option[value = 3222]").show();
  }
});

$("#test3").on("change", function(){
  $("#test4 option").hide();
  if($(this).val() == "3111"){
    $("#test4 option[value = fourthTest1]").show();
  } else if($(this).val() == "212"){
    $("#test4 option[value = 3121]").show();
    $("#test4 option[value = 3122]").show();
  } else if($(this).val() == "221"){
    $("#test4 option[value = 3211]").show();
    $("#test4 option[value = 3212]").show();
  } else if($(this).val() == "222"){
    $("#test4 option[value = 3221]").show();
    $("#test4 option[value = 3222]").show();
  }
});