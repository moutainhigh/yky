webpackJsonp([21],{IaUk:function(t,e){},LLLn:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default={data:function(){return{year:[{id:"2017",label:"2017"},{id:"2018",label:"2018"},{id:"2019",label:"2019"},{id:"2020",label:"2020"}],subjectCategoryList:[],proStatList:[],proTypeList:[],value1:"",value2:"",value3:"",value4:"",value5:"",value6:"",value7:"",value8:"",value9:"",value10:"",currentPage:1,tableData:[],multipleSelection:[],formData:{username:"",password:"",email:"",mobile:""},formRules:{username:[{required:!0,message:"请输入批准号",trigger:"blur"},{min:1,max:5,message:"长度在 1 到 5 个字符",trigger:"blur"}],password:[{required:!0,message:"请输入活动名称",trigger:"blur"},{min:1,max:5,message:"长度在 1 到 5 个字符",trigger:"blur"}]},editUserDialogFormVisible:!1}},created:function(){var t=this;this.$dt.getAjax("/project/list/approvalProject",{},function(e){t.tableData=e},function(){})},methods:{handleApply:function(t){this.$router.push({name:t.routeName})},proTypeFormat:function(t,e){if(t.subjectCategory)return"111"},subjectCategoryFormat:function(t,e){for(var a=0;a<this.subjectCategoryList.length;a++)if(t.subjectCategory==this.subjectCategoryList[a].value)return this.subjectCategoryList[a].label},proStatFormat:function(t,e){if(t.subjectCategory)return"111"},approvalProject:function(){var t=this;alert(this.multipleSelection),this.$dt.postAjax("/project/approval",this.multipleSelection,function(e){t.$dt.getAjax("/project/list/approvalProject",{},function(e){t.tableData=e},function(){})},function(){})},SureHandleEdit:function(){},handleDelete:function(){var t=this;this.$confirm("此操作将永久删除该文件, 是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning",center:!0}).then(function(){t.$message({type:"success",message:"删除成功!"})}).catch(function(){t.$message({type:"info",message:"已取消删除"})})},handleClosed:function(){for(var t in this.formData)this.formData[t]=""},toggleSelection:function(t){var e=this;t?t.forEach(function(t){e.$refs.multipleTable.toggleRowSelection(t)}):this.$refs.multipleTable.clearSelection()},handleSelectionChange:function(t){this.multipleSelection=t},handleSizeChange:function(t){console.log("每页 "+t+" 条")},handleCurrentChange:function(t){console.log("当前页: "+t)}}}},MrhQ:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var l=a("LLLn"),s=a.n(l);for(var n in l)"default"!==n&&function(t){a.d(e,t,function(){return l[t]})}(n);var i=a("m4CG");var o=function(t){a("IaUk")},r=a("VU/8")(s.a,i.a,!1,o,null,null);e.default=r.exports},m4CG:function(t,e,a){"use strict";var l={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("dt-scroll-box",[a("div",{attrs:{slot:"top"},slot:"top"},[a("p",{staticClass:"dt-bread-item"},[t._v("项目批复")])]),t._v(" "),a("div",{attrs:{slot:"main-content"},slot:"main-content"},[a("div",{staticClass:"projectQuery"},[a("div",{staticClass:"qmiddle"},[a("ul",[a("li",{staticClass:"fl"},[a("div",{staticClass:"proNum"},[a("span",{staticClass:"fl"},[t._v("项目名称：")]),t._v(" "),a("el-input",{attrs:{placeholder:"请输入内容"},model:{value:t.value1,callback:function(e){t.value1=e},expression:"value1"}})],1),t._v(" "),a("div",{staticClass:"name"},[a("span",{staticClass:"fl"},[t._v("姓名：")]),t._v(" "),a("div",{staticClass:"selectInp"},[a("el-input",{attrs:{placeholder:"请输入内容"},model:{value:t.value1,callback:function(e){t.value1=e},expression:"value1"}})],1)])]),t._v(" "),a("li",{staticClass:"fl"},[a("div",{staticClass:"proType"},[a("span",{staticClass:"fl"},[t._v("项目类型：")]),t._v(" "),a("div",{staticClass:"selectInp"},[a("el-select",{attrs:{clearable:"",placeholder:"请选择"},model:{value:t.value3,callback:function(e){t.value3=e},expression:"value3"}},t._l(t.proTypeList,function(t){return a("el-option",{key:t.value,attrs:{label:t.label,value:t.value}})}),1)],1)]),t._v(" "),a("div",{staticClass:"supportUnit"},[a("span",{staticClass:"fl"},[t._v("依托单位：")]),t._v(" "),a("div",{staticClass:"selectInp"},[a("el-input",{attrs:{placeholder:"请输入内容"},model:{value:t.value1,callback:function(e){t.value1=e},expression:"value1"}})],1)])]),t._v(" "),a("li",{staticClass:"fl"},[a("div",{staticClass:"disciplineClass"},[a("span",{staticClass:"fl"},[t._v("学科分类：")]),t._v(" "),a("div",{staticClass:"selectInp"},[a("el-select",{attrs:{clearable:"",placeholder:"请选择"},model:{value:t.value2,callback:function(e){t.value2=e},expression:"value2"}},t._l(t.subjectCategoryList,function(t){return a("el-option",{key:t.value,attrs:{label:t.label,value:t.value}})}),1)],1)])]),t._v(" "),a("li",{staticClass:"fr"},[a("div",{staticClass:"reset fr"},[a("el-button",{staticClass:"dt-btn",on:{click:t.approvalProject}},[a("i",{staticClass:"iconfont icon-shanchu"}),t._v("批复\n\t\t\t\t\t\t\t")])],1)])])]),t._v(" "),a("el-table",{ref:"multipleTable",staticStyle:{width:"100%"},attrs:{data:t.tableData,"tooltip-effect":"dark",border:"","header-cell-style":{background:"#EBEBEB"}},on:{"selection-change":t.handleSelectionChange}},[a("el-table-column",{attrs:{type:"selection",width:"55"}}),t._v(" "),a("el-table-column",{attrs:{prop:"projectName",label:"项目名称"}}),t._v(" "),a("el-table-column",{attrs:{prop:"name",label:"姓名"}}),t._v(" "),a("el-table-column",{attrs:{prop:"dependDeptName",label:"依托单位"}}),t._v(" "),a("el-table-column",{attrs:{prop:"proType",label:"项目类型",formatter:t.proTypeFormat}}),t._v(" "),a("el-table-column",{attrs:{prop:"applyNum",label:"申报编码"}}),t._v(" "),a("el-table-column",{attrs:{prop:"subjectCategory",label:"学科方向",formatter:t.subjectCategoryFormat}}),t._v(" "),a("el-table-column",{attrs:{prop:"proStat",label:"项目状态",formatter:t.proStatFormat}})],1)],1)])])},staticRenderFns:[]};e.a=l}});
//# sourceMappingURL=21.ef3333fbfe593969fdbf.js.map