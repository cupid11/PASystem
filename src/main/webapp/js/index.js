
function add() {
    var name = $("#name").val();
    var address = $('#province').find("option:selected").text()+$('#city').find("option:selected").text()+$('#area').find("option:selected").text();
    var sex = $("#sex").val();
    var email = $("#email").val();
    var postcode = $("#postcode").val();
    var description = $("#description").val();
    var birthday = $("#birthday").val();

    var userInfo = {
        "name": name,
        "address": address,
        "birth_date": birthday,
        "description": description,
        "email": email,
        "postcode": postcode,
        "sex": sex
    };
    var url = "/app/user/store";
    $.ajax({
        url: url,
        type: 'json',
        method: 'post',
        data: JSON.stringify(userInfo),
        contentType: 'application/json; charset=UTF-8'
    });
    window.location.reload();
}

function resetForm() {
    document.getElementById("name").value = null;
    document.getElementById("email").value = null;
    document.getElementById("postcode").value = null;
    document.getElementById("description").value = null;
}

var currentPage = 1;
var pages = 5;
function toggle() {
    var Trs = [...$('.table>tbody>tr')];

    for(var i = 0;i<Trs.length;i++){
        if(i>=((currentPage - 1) * pages) && i < currentPage * pages){
            Trs[i].style.display='';
        }else{
            Trs[i].style.display='none';
        }
    }
}


function closeDe() {
    var main = document.getElementById("main");
    main.style.display="block";
    var details = document.getElementById("details");
    details.style.display="none";
}

function getArea(id=null, selectName=null) {
    if(id){
        var url = "http://59.111.58.150:8102/api/region?parent_id="+id;
    }else{
        var url = "http://59.111.58.150:8102/api/region";
    }
    if(selectName){
        selectName = eval('$("#'+selectName+'")');
    }else{
        selectName = $("#province");
        $("#city option:not(:first)").remove();
        var cityText=$("#city option:first").text();
        $("#city").html('<option>'+cityText+'</option>');
        $("#area option:not(:first)").remove();
        var areaText=$("#area option:first").text();
        $("#areaText").html('<option>'+areaText+'</option>');
    }
    $.get(url, function (data, status) {
        if(status == "success"){
            var str = null;
            for(var i in data){
                str +='<option value="'+data[i].id+'">'+data[i].name+'</option>';
            }
            selectName.append(str);
        }
    });
}

var page=1;
var pageSize=5;

function allUsers() {
    var url = "/app/user/queryByPage?page="+page+"&pageSize="+pageSize;
    $.get(url, function (data, status) {
        var tr = "";
        for (var i in data){
             tr = tr +
                 `
                    <tr>
                        <td>${data[i].id}</td>
                        <td>${data[i].name}</td>
                        <td>${data[i].sex}</td>
                        <td>${data[i].address}</td>
                        <td>${data[i].email}</td>
                        <td><button onclick="deleteRow(${data[i].id})">删除</button>
                        <button onclick="showDetails(${data[i].id})">详情</button></td>
                    </tr>
                 `
        }
        $("#table>tbody").html(tr);
    });
}

function next() {
    page++;
    allUsers();
}
function prev() {
    page--;
    allUsers();
}

function deleteRow(id) {
    var url = "/app/user/"+id;
    $.ajax({
        url: url,
        type: 'DELETE',
        data: {}
    });
    window.location.reload();
}

function showDetails(id) {
    var url = "/app/user/show/"+id;
    $.get(url, function (data, status) {
        // console.log(data.name);debugger;
        var name = data.name;
        var address = data.address;
        var sex = data.sex;
        var email = data.email;
        var postcode = data.postcode;
        var description = data.description;
        var birthday = data.birthday;

        var main = document.getElementById("main");
        main.style.display="none";
        var details = document.getElementById("details");
        details.style.display="block";

        var detailsH1 = document.getElementById('detailsH1');
        detailsH1.innerHTML = "Details Of "+name;

        $("#deName").text(name);
        $("#deAddress").text(address);
        $("#deSex").text(sex);
        $("#deEmail").text(address);
        $("#dePostCode").text(postcode);
        $("#deDescription").text(description);
        $("#deBirthday").text(birthday);

    });
}


