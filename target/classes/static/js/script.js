var taskForm = document.getElementById("taskform");
var inputTask=document.getElementById("intask");
var cbox=document.getElementsByName("cbox");
var resForm=document.getElementById("result");

function getButton(id,value){
    let button = document.createElement("input");
    button.setAttribute("type", "submit");
    button.setAttribute("class", "fb");
    button.setAttribute("id", id);
    button.value=value;
    return button;
}
var buttona = getButton("top","Add Task");
var inputValue;

inputTask.onkeyup =  function(){
    inputValue = inputTask.value;
    if(inputValue.trim()!=''){
        taskForm.appendChild(buttona);
    }else{
        taskForm.removeChild(buttona);
    }
}
button1=getButton("first","Delete Task");
cbox.onclick=function(){
    if(cbox.checked){resForm.appendChild(button1);}
    else{resForm.removeChild(button1);}

}
function insertButton(checkbox){
    let id=checkbox.getAttribute("id");
    let anchors=document.getElementsByTagName("a");
    for(anchor in anchors){
    if(anchor.getAttribute("id")==id){anchor.appendChild(button1);}
        else{anchor.removeChild(button1);}
    }

    }

