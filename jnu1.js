function categoryChange(e) {
    const jejuuniversity = document.getElemantbyid("제주대학교");

    const 제주대학교 = ["총장", "아라캠퍼스 부총장", "사라캠퍼스 부총장"];
    const 본부 = ["교무처", "학생진로취업처", "기획처", "사무국"];
    const 대학 = ["단과대학통합행정실", "인문대학", "사회과학대학", "경상대학", "사범대학", "생명자원과학대학", "해양과학대학", "자연과학대학", "공과대학", "의과대학", "교육대학", "수의과대학", "간호대학", "예술디자인대학", "미래융합대학", "약학대학"];
    const 대학원 = ["대학원통합행정실", "대학원", "통역번역대학원", "의학전문대학원", "법학전문대학원", "교육대학원", "경영대학원", "행정대학원", "산업대학원", "사회교육대학원", "보건복지대학원"];
    const 부속시설 = ["교육기본시설", "지원시설", "연구시설", "기타시설", "부설학교", "교수회"];
    const 산학협력단 = ["산학협력실", "산학협력과", "제주대학교기술지주(주)", "친환경농산물인중센터", "제주해양생물번식육종평가센터","창업교육센터","과학기술사회연구센터","제주특별자치도 농촌활성화 지원센터"];

    if (e.value == "general01") {
        add = 제주대학교;
    } else if (e.value == "general02") {
        add = 본부;
    } else if (e.value == "general03") {
        add = 대학;
    } else if (e.value == "general04") {
        add = 대학원;
    } else if (e.vale == "general05") {
        add = 부속시설;
    } else if (e.vale == "general06") {
        add = 산학협력단;
    }


jejuuniversity.options.length = 1;
// 
for (const property in add) {
        let opt = document.createElement("option");
        opt.value = add[property];
        opt.innerHTML = add[property];
        StaticRange.appendChild(opt);
    }
}

{
    const 제주대학교 = ["총장", "아라캠퍼스 부총장", "사라캠퍼스 부총장"];

    for (const property in 제주대학교) {

        console.log(제주대학교[property])
    }
}