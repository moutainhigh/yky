webpackJsonp([19],{"7Jem":function(e,t,a){"use strict";var l={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("dt-scroll-box",[a("div",{attrs:{slot:"top"},slot:"top"},[a("p",{staticClass:"dt-bread-item"},[e._v("项目查询")])]),e._v(" "),a("div",{attrs:{slot:"main-content"},slot:"main-content"},[a("div",{staticClass:"projectQuery"},[a("div",{staticClass:"qmiddle"},[a("ul",[a("li",{staticClass:"fl"},[a("div",{staticClass:"proNum"},[a("span",{staticClass:"fl"},[e._v("项目申请编号：")]),e._v(" "),a("el-input",{attrs:{placeholder:"请输入内容"},model:{value:e.value1,callback:function(t){e.value1=t},expression:"value1"}})],1),e._v(" "),a("div",{staticClass:"disciplineClass"},[a("span",{staticClass:"fl"},[e._v("学科分类：")]),e._v(" "),a("div",{staticClass:"selectInp"},[a("el-select",{attrs:{clearable:"",placeholder:"请选择"},model:{value:e.value2,callback:function(t){e.value2=t},expression:"value2"}},e._l(e.subjectCategoryList,function(e){return a("el-option",{key:e.value,attrs:{label:e.label,value:e.value}})}),1)],1)]),e._v(" "),a("div",{staticClass:"proType"},[a("span",{staticClass:"fl"},[e._v("项目类型：")]),e._v(" "),a("div",{staticClass:"selectInp"},[a("el-select",{attrs:{clearable:"",placeholder:"请选择"},model:{value:e.value3,callback:function(t){e.value3=t},expression:"value3"}},e._l(e.proTypeList,function(e){return a("el-option",{key:e.value,attrs:{label:e.label,value:e.value}})}),1)],1)])]),e._v(" "),a("li",{staticClass:"fl"},[a("div",{staticClass:"proName"},[a("span",{staticClass:"fl"},[e._v("项目名称：")]),e._v(" "),a("div",{staticClass:"selectInp"},[a("el-input",{attrs:{placeholder:"请输入内容"},model:{value:e.value1,callback:function(t){e.value1=t},expression:"value1"}})],1)]),e._v(" "),a("div",{staticClass:"supportUnit"},[a("span",{staticClass:"fl"},[e._v("依托单位：")]),e._v(" "),a("div",{staticClass:"selectInp"},[a("el-input",{attrs:{placeholder:"请输入内容"},model:{value:e.value1,callback:function(t){e.value1=t},expression:"value1"}})],1)]),e._v(" "),a("div",{staticClass:"proStatus"},[a("span",{staticClass:"fl"},[e._v("项目状态：")]),e._v(" "),a("div",{staticClass:"selectInp"},[a("el-select",{attrs:{clearable:"",placeholder:"请选择"},model:{value:e.value6,callback:function(t){e.value6=t},expression:"value6"}},e._l(e.proStatList,function(e){return a("el-option",{key:e.value,attrs:{label:e.label,value:e.value}})}),1)],1)])]),e._v(" "),a("li",{staticClass:"fl"},[a("div",{staticClass:"proDeclaration"},[a("span",{staticClass:"fl"},[e._v("项目年度(申报)：")]),e._v(" "),a("div",{staticClass:"selectInp"},[a("el-select",{attrs:{clearable:"",placeholder:"请选择"},model:{value:e.value7,callback:function(t){e.value7=t},expression:"value7"}},e._l(e.year,function(e){return a("el-option",{key:e.value,attrs:{label:e.label,value:e.value}})}),1)],1)]),e._v(" "),a("div",{staticClass:"proRoles"},[a("span",{staticClass:"fl"},[e._v("项目角色：")]),e._v(" "),a("div",{staticClass:"selectInp"},[a("el-select",{attrs:{clearable:"",placeholder:"请选择"},model:{value:e.value8,callback:function(t){e.value8=t},expression:"value8"}},e._l(e.year,function(e){return a("el-option",{key:e.value,attrs:{label:e.label,value:e.value}})}),1)],1)]),e._v(" "),a("div",{staticClass:"name"},[a("span",{staticClass:"fl"},[e._v("姓名：")]),e._v(" "),a("div",{staticClass:"selectInp"},[a("el-input",{attrs:{placeholder:"请输入内容"},model:{value:e.value1,callback:function(t){e.value1=t},expression:"value1"}})],1)])]),e._v(" "),a("li",{staticClass:"fr"},[a("div",{staticClass:"query fl"},[a("el-button",{staticClass:"dt-btn",on:{click:e.serach}},[a("i",{staticClass:"iconfont icon-shanchu"}),e._v("查询\n\t\t\t\t\t\t\t\t")])],1),e._v(" "),a("div",{staticClass:"reset fr"},[a("el-button",{staticClass:"dt-btn"},[a("i",{staticClass:"iconfont icon-shanchu"}),e._v("重置\n\t\t\t\t\t\t\t\t")])],1)])])]),e._v(" "),a("el-table",{ref:"multipleTable",staticStyle:{width:"100%"},attrs:{data:e.tableData,"tooltip-effect":"dark",border:"","header-cell-style":{background:"#EBEBEB"}},on:{"selection-change":e.handleSelectionChange}},[a("el-table-column",{attrs:{type:"selection",width:"55"}}),e._v(" "),a("el-table-column",{attrs:{prop:"registerNumber",label:"项目编号"}}),e._v(" "),a("el-table-column",{attrs:{prop:"projectName",label:"项目名称"}}),e._v(" "),a("el-table-column",{attrs:{prop:"name",label:"姓名"}}),e._v(" "),a("el-table-column",{attrs:{prop:"dependDeptName",label:"依托单位"}}),e._v(" "),a("el-table-column",{attrs:{prop:"proType",label:"项目类型",formatter:e.proTypeFormat}}),e._v(" "),a("el-table-column",{attrs:{prop:"applyCode",label:"申报编码"}}),e._v(" "),a("el-table-column",{attrs:{prop:"subjectCategory",label:"学科方向",formatter:e.subjectCategoryFormat}}),e._v(" "),a("el-table-column",{attrs:{prop:"proStat",label:"项目状态",formatter:e.proStatFormat}}),e._v(" "),a("el-table-column",{attrs:{label:"操作",width:"250"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("el-button",{attrs:{type:"text"},on:{click:function(a){e.handleApply1(t.row)}}},[e._v("申请书")]),e._v(" "),a("el-button",{attrs:{type:"text"},on:{click:function(a){e.handleApply2(t.row)}}},[e._v("预算书")]),e._v(" "),a("el-button",{attrs:{type:"text"},on:{click:function(a){e.handleApply3(t.row)}}},[e._v("任务书")])]}}])})],1),e._v(" "),a("div",{staticClass:"block paging fl"},[a("el-pagination",{attrs:{"current-page":e.currentPage,"page-sizes":[100,200,300,400],"page-size":100,layout:"total, sizes, prev, pager, next, jumper",total:400},on:{"size-change":e.handleSizeChange,"current-change":e.handleCurrentChange}})],1)],1)])])},staticRenderFns:[]};t.a=l},"9TJ9":function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.default={data:function(){return{year:[{id:"2017",label:"2017"},{id:"2018",label:"2018"},{id:"2019",label:"2019"},{id:"2020",label:"2020"}],subjectCategoryList:[],proStatList:[],proTypeList:[],value1:"",value2:"",value3:"",value4:"",value5:"",value6:"",value7:"",value8:"",value9:"",value10:"",currentPage:1,tableData:[],multipleSelection:[],formData:{username:"",password:"",email:"",mobile:""},formRules:{username:[{required:!0,message:"请输入批准号",trigger:"blur"},{min:1,max:5,message:"长度在 1 到 5 个字符",trigger:"blur"}],password:[{required:!0,message:"请输入活动名称",trigger:"blur"},{min:1,max:5,message:"长度在 1 到 5 个字符",trigger:"blur"}]},editUserDialogFormVisible:!1}},created:function(){var e=this;this.$dt.getAjax("/sys-dict/codes/PRO_STAT+PRO_TYPE",{},function(t){e.proStatList=t.PRO_STAT,e.proTypeList=t.PRO_TYPE},function(){})},methods:{handleApply1:function(e){this.$router.push({path:"/innovate-forerunner",query:{id:e.id}})},handleApply2:function(e){this.$router.push({path:"/innovate-budget",query:{id:e.id}})},handleApply3:function(e){this.$router.push({path:"/innovate-forerunner",query:{id:e.id}})},proTypeFormat:function(e,t){if(e.subjectCategory)return"111"},subjectCategoryFormat:function(e,t){for(var a=0;a<this.subjectCategoryList.length;a++)if(e.subjectCategory==this.subjectCategoryList[a].value)return this.subjectCategoryList[a].label},proStatFormat:function(e,t){if(e.subjectCategory)return"111"},serach:function(){var e=this;this.$dt.postAjax("/project/page/conditions",{currentPage:0,pageSize:500},function(t){e.tableData=t.records},function(){})},SureHandleEdit:function(){},handleDelete:function(){var e=this;this.$confirm("此操作将永久删除该文件, 是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning",center:!0}).then(function(){e.$message({type:"success",message:"删除成功!"})}).catch(function(){e.$message({type:"info",message:"已取消删除"})})},handleClosed:function(){for(var e in this.formData)this.formData[e]=""},toggleSelection:function(e){var t=this;e?e.forEach(function(e){t.$refs.multipleTable.toggleRowSelection(e)}):this.$refs.multipleTable.clearSelection()},handleSelectionChange:function(e){this.multipleSelection=e},handleSizeChange:function(e){console.log("每页 "+e+" 条")},handleCurrentChange:function(e){console.log("当前页: "+e)}}}},TyTs:function(e,t){},ZOnq:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var l=a("9TJ9"),s=a.n(l);for(var n in l)"default"!==n&&function(e){a.d(t,e,function(){return l[e]})}(n);var i=a("7Jem");var r=function(e){a("TyTs")},o=a("VU/8")(s.a,i.a,!1,r,null,null);t.default=o.exports}});
//# sourceMappingURL=19.f1ea6143b45274da4157.js.map