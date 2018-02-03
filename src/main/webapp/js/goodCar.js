/**
 * goodCar页面初始化时加载的js文件
 */

function createBuyCar(data) { //data

	//打印获取的数据
	console.log(JSON.stringify(data));
	console.log("进来了");

	//动态创建放置商品的<li>
	//	var buyCar_good_list_content = document.getElementById("good_list_content");
	//	console.log(buyCar_good_list_content);
	var buyCar_ul = document.getElementById('buyCar_ul');
	var buyCar_goodnum = data.length;
	for (var i = 0; i < buyCar_goodnum; i++) {

		var buyCar_li = document.createElement("li");
		buyCar_li.setAttribute("class", "mui-table-view-cell mui-media");

		var buyCar_li_checkBox = document.createElement("input");
		buyCar_li_checkBox.setAttribute("class", "li_goodBuyCar mui-media-object mui-pull-left");
		buyCar_li_checkBox.setAttribute("type", "checkbox");
		buyCar_li_checkBox.setAttribute("id", "check" + i);
		buyCar_li_checkBox.style.width = "18px";
		buyCar_li_checkBox.style.height = "18px";
		buyCar_li_checkBox.style.textAlign = "center";
		buyCar_li.appendChild(buyCar_li_checkBox);

		var buyCar_li_image = document.createElement("img");
		buyCar_li_image.setAttribute("class", "mui-media-object mui-pull-left");
		buyCar_li_image.setAttribute("src", data[i].photo_url); //"good_image/accessory_image/accessory_1_1.jpg"
		buyCar_li.appendChild(buyCar_li_image);

		//创建商品信息的Div
		var buyCar_li_infoDiv = document.createElement("div");
		buyCar_li_infoDiv.setAttribute("class", "mui-media-body");

		var buyCar_li_infoDescription = document.createElement("p");
		buyCar_li_infoDescription.setAttribute("class", "mui-ellipsis");
		buyCar_li_infoDescription.innerText = data[i].description;
		; //"九分裤男士绅士休闲裤青年韩版修身 小脚裤子弹力"
		buyCar_li_infoDiv.appendChild(buyCar_li_infoDescription);

		var buyCar_li_goodChoose = document.createElement("p");
		buyCar_li_goodChoose.innerText = data[i].good_choose; //"good_choose"
		buyCar_li_infoDiv.appendChild(buyCar_li_goodChoose);

		var buyCar_li_goodPrice = document.createElement("p");
		buyCar_li_goodPrice.innerText = "¥" + data[i].good_price * data[i].good_num; //"0.00";
		buyCar_li_infoDiv.appendChild(buyCar_li_goodPrice);

		var buyCar_li_numBox = document.createElement("div");
		buyCar_li_numBox.setAttribute("class", "mui-numbox");
		buyCar_li_numBox.setAttribute("data-numbox-step", "1");
		buyCar_li_numBox.setAttribute("data-numbox-min", "0");
		buyCar_li_numBox.style.display = "inline";
		buyCar_li_numBox.style.float = "right";
		var buyCar_li_numBox_minus = document.createElement("button");
		buyCar_li_numBox_minus.setAttribute("class", "mui-btn mui-numbox-btn-minus");
		buyCar_li_numBox_minus.setAttribute("type", "button");
		buyCar_li_numBox_minus.innerText = "-";
		buyCar_li_numBox.appendChild(buyCar_li_numBox_minus);
		var buyCar_li_numBox_input = document.createElement("input");
		buyCar_li_numBox_input.setAttribute("class", "mui-numbox-input");
		buyCar_li_numBox_input.setAttribute("type", "number");
		buyCar_li_numBox_input.value = data[i].good_num;
		buyCar_li_numBox.appendChild(buyCar_li_numBox_input);
		var buyCar_li_numBox_plus = document.createElement("button");
		buyCar_li_numBox_plus.setAttribute("class", "mui-btn mui-numbox-btn-plus");
		buyCar_li_numBox_plus.setAttribute("type", "button");
		buyCar_li_numBox_plus.innerText = "+";
		buyCar_li_numBox.appendChild(buyCar_li_numBox_plus);
		buyCar_li_infoDiv.appendChild(buyCar_li_numBox);

		buyCar_li.appendChild(buyCar_li_infoDiv);

		//		console.log(buyCar_li);
		//		console.log(buyCar_ul);
		buyCar_ul.appendChild(buyCar_li);

	}

}

/*
 * 点击购物车顶部的全选被选中的事件
 */

function selectAllGoods() {
	console.log("全选框被选中");

	//获取所有商品的父节点buyCar_ul
	var buyCar_ul = document.getElementById('buyCar_ul');
	var selectNum = buyCar_ul.childElementCount;
	var goodSum = 0;
	console.log(buyCar_ul.children[0].children[2].children[2]);
	for (var i = 0; i < selectNum; i++) {
		var goodPrice = buyCar_ul.children[i].children[2].children[2].innerText.substring(1);
		buyCar_ul.children[i].children[0].checked = true;
		goodSum += parseFloat(goodPrice);
	}
	console.log("总金额为 : " + goodSum);
	document.getElementById('good_car_sum_money').innerText = "¥" + goodSum.toFixed(2);
}

/**
 * 取消购物车商品的全选
 * 
 */
function resetAllSelectGoods() {
	console.log("购物车商品取消全选");

	//获取所有商品的父节点buyCar_ul
	var buyCar_ul = document.getElementById('buyCar_ul');
	var selectNum = buyCar_ul.childElementCount;
	console.log(buyCar_ul.children[0].children[2].children[2]);
	for (var i = 0; i < selectNum; i++) {
		buyCar_ul.children[i].children[0].checked = false;
	}
	document.getElementById('good_car_sum_money').innerText = "¥0.00";

}

/*
 * 购物车前面的选择框被选择调用函数
 * */
function selectGood(sumOfMoneyObj){
	
	console.log("增加的价钱是 : " + sumOfMoneyObj.innerText.substring(1));
	var allSum = parseFloat(document.getElementById('good_car_sum_money').innerText.substr(1));
	var addSum = parseFloat(sumOfMoneyObj.innerText.substring(1));
	allSum += addSum;
	document.getElementById('good_car_sum_money').innerText = "¥" + allSum.toFixed(2);
	
}

/*
 * 购物车前面的选择框被取消选择调用函数
 * */
function resetSelectGoods(sumOfMoneyObj){
	
	var allSum = parseFloat(document.getElementById('good_car_sum_money').innerText.substr(1));
	var minusSum = parseFloat(sumOfMoneyObj.innerText.substring(1));
	allSum -= minusSum;
	document.getElementById('good_car_sum_money').innerText = "¥" + allSum.toFixed(2);
	
}

