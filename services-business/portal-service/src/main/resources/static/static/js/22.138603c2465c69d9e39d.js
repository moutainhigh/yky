webpackJsonp([22],{C8pS:function(t,a,l){"use strict";Object.defineProperty(a,"__esModule",{value:!0}),a.default={data:function(){return{centerDialogVisible:!1,tableData:[{proType:"院基科费",bendTime:"2018.01.21-2019.01.22",appCondition:"1.申请人为高级教授;2.申请人bulabulabulabulabulabulabulabula",routeName:"academyExpense"},{proType:"校基科费(教师)",bendTime:"2018.01.21-2019.01.22",appCondition:"1.申请人为高级教授;2.申请人bulabulabulabulabulabulabulabula",routeName:"schoolExpTeacher"},{proType:"校基科费(学生)",bendTime:"2018.01.21-2019.01.22",appCondition:"1.申请人为高级教授;2.申请人bulabulabulabulabulabulabulabula",routeName:"schoolExpStu"},{proType:"创新工程-重大协同创新",bendTime:"2018.01.21-2019.01.22",appCondition:"1.申请人为高级教授;2.申请人bulabulabulabulabulabulabulabula",routeName:"innovateCollaboration"},{proType:"创新工程-先导专项",bendTime:"2018.01.21-2019.01.22",appCondition:"1.申请人为高级教授;2.申请人bulabulabulabulabulabulabulabula",routeName:"innovateForerunner"},{proType:"创新工程-协同创意团队",bendTime:"2018.01.21-2019.01.22",appCondition:"1.申请人为高级教授;2.申请人bulabulabulabulabulabulabulabula",routeName:"innovateCreative"}],tableData1:[{proName:"名称11111111",proType:"类型111111111",proStatus:"状态11111111",proYear:2013,subjectCate:"分类11111111",unit:"单位11111111",applyNum:11,budgeNum:1313},{proName:"名称1",proType:"类型1",proStatus:"状态1",proYear:2013,subjectCate:"分类1",unit:"单位1",applyNum:11,budgeNum:1313},{proName:"名称1",proType:"类型1",proStatus:"状态1",proYear:2013,subjectCate:"分类1",unit:"单位1",applyNum:11,budgeNum:1313},{proName:"名称1",proType:"类型1",proStatus:"状态1",proYear:2013,subjectCate:"分类1",unit:"单位1",applyNum:11,budgeNum:1313}]}},methods:{handleApply:function(t){this.$router.push({name:t.routeName})}}}},I9aa:function(t,a){},"bKa+":function(t,a,l){"use strict";Object.defineProperty(a,"__esModule",{value:!0});var e=l("C8pS"),o=l.n(e);for(var u in e)"default"!==u&&function(t){l.d(a,t,function(){return e[t]})}(u);var p=l("bO6r");var r=function(t){l("I9aa")},n=l("VU/8")(o.a,p.a,!1,r,null,null);a.default=n.exports},bO6r:function(t,a,l){"use strict";var e={render:function(){var t=this,a=t.$createElement,l=t._self._c||a;return l("dt-scroll-box",[l("div",{attrs:{slot:"top"},slot:"top"},[l("p",{staticClass:"dt-bread-item"},[t._v("项目申请")])]),t._v(" "),l("div",{attrs:{slot:"main-content"},slot:"main-content"},[l("div",{staticClass:"projectApply-page"},[l("el-table",{staticStyle:{width:"100%"},attrs:{data:t.tableData,"tooltip-effect":"dark","header-cell-style":{background:"#EBEBEB"}}},[l("el-table-column",{attrs:{prop:"proType",label:"项目类别",width:""}}),t._v(" "),l("el-table-column",{attrs:{prop:"bendTime",label:"申请起止时间",width:""}}),t._v(" "),l("el-table-column",{attrs:{prop:"appCondition",label:"申请条件",width:"300","show-overflow-tooltip":""}}),t._v(" "),l("el-table-column",{attrs:{label:"操作"},scopedSlots:t._u([{key:"default",fn:function(a){return[l("span",{staticClass:"dt-txt-btn",on:{click:function(l){t.handleApply(a.row)}}},[t._v("申请")])]}}])})],1),t._v(" "),l("p",{staticClass:"applytitle",staticStyle:{marginTop:"20px"}},[t._v("我的申请(草稿箱)")]),t._v(" "),l("el-table",{staticClass:"drafts",staticStyle:{width:"100%"},attrs:{data:t.tableData1,"tooltip-effect":"dark","header-cell-style":{background:"#EBEBEB"}}},[l("el-table-column",{attrs:{prop:"proName",label:"项目名称","show-overflow-tooltip":"",width:""}}),t._v(" "),l("el-table-column",{attrs:{prop:"proType",label:"项目类型","show-overflow-tooltip":"",width:""}}),t._v(" "),l("el-table-column",{attrs:{prop:"proStatus",label:"项目状态","show-overflow-tooltip":""}}),t._v(" "),l("el-table-column",{attrs:{prop:"proYear",label:"项目年度","show-overflow-tooltip":"",width:""}}),t._v(" "),l("el-table-column",{attrs:{prop:"subjectCate",label:"学科分类","show-overflow-tooltip":"",width:""}}),t._v(" "),l("el-table-column",{attrs:{prop:"unit",label:"依托单位","show-overflow-tooltip":"",width:""}}),t._v(" "),l("el-table-column",{staticClass:"blue",attrs:{prop:"applyNum","show-overflow-tooltip":"",label:"申请书编号",width:""}}),t._v(" "),l("el-table-column",{staticClass:"blue",attrs:{prop:"budgeNum","show-overflow-tooltip":"",label:"预算书编号",width:""}}),t._v(" "),l("el-table-column",{attrs:{label:"操作"},scopedSlots:t._u([{key:"default",fn:function(a){return[l("span",{staticClass:"dt-txt-btn",on:{click:function(l){t.handleApply(a.row)}}},[t._v("删除")]),t._v(" "),l("span",{staticClass:"dt-txt-btn",staticStyle:{marginLeft:"10px"},on:{click:function(l){t.handleApply(a.row)}}},[t._v("提交")]),t._v(" "),l("span",{staticClass:"dt-txt-btn",staticStyle:{marginLeft:"10px"},on:{click:function(l){t.handleApply(a.row)}}},[t._v("立项")])]}}])})],1)],1)])])},staticRenderFns:[]};a.a=e}});
//# sourceMappingURL=22.138603c2465c69d9e39d.js.map