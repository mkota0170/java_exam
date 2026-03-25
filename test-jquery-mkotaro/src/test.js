"user strict";
// #id .class

console.log("松花虎太郎");

$("#namecolor").on("click", function () {
  $("#name").css("color", "red");
});

$("#displayAge").on("click", function () {
  alert($("#inputAge").val());
});

$("#cantPush").on("click", function () {
  $("#cantPush").prop("disabled", true);
});

$("#selectList").on("change", function () {
  $("#JavaScript").hide();
  $("#Java").hide();

  if ($(selectList).val() == "Java") {
    $("#Java").show();
  } else if ($(selectList).val() == "JavaScript") {
    $("#JavaScript").show();
  }
});
