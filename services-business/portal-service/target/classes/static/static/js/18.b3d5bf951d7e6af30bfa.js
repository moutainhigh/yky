webpackJsonp([18],{"K1o+":function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var l,i=a("Yyxw"),n=(l=i)&&l.__esModule?l:{default:l};e.default={name:"projectReview",components:{DtDialog:n.default},data:function(){return{searchData:{},tableData:[],stateOptions:[],dialogShow:!1,typeOptions:[],orgOptions:[],yearOptions:[]}},created:function(){this.initPage(),this.typeOptions=[{children:[{children:[{id:"921876375923593218",label:"创新工程"},{id:"921876375927787520",label:"院基科费"},{id:"921876375931981824",label:"校基科费"},{id:"921876375931981825",label:"改革经费"}],id:"921876375923593217",label:"院校级"},{children:[{children:[],id:"921876375931981827",label:"国家科技重大专项"},{children:[],id:"921876375931981828",label:"国家重点研发计划项目"},{children:[],id:"921876375936176128",label:"技术创新引导专项"},{children:[],id:"921876375936176129",label:"重大科学计划"},{children:[],id:"921876375936176130",label:"科技支撑计划"},{children:[],id:"921876375940370432",label:"973计划"},{children:[],id:"921876375940370433",label:"863计划"},{children:[],id:"921876375940370434",label:"基地和人才专项"},{children:[],id:"921876375940370435",label:"基础条件平台"},{children:[],id:"921876375940370436",label:"国际合作项目(科技部)"},{children:[],id:"921876375940370437",label:"其他计划项目"},{children:[],id:"921876375940370438",label:"国家自然科学基金项目"},{children:[],id:"921876375940370439",label:"国家社会科学基金项目"}],id:"921876375931981826",label:"国家级"},{children:[{children:[],id:"921876375944564737",label:"国家卫生健康委项目"},{children:[],id:"921876375944564738",label:"教育部项目"},{children:[],id:"921876375944564739",label:"国家发改委项目"},{children:[],id:"921876375944564740",label:"国家药监局项目"},{children:[],id:"921876375944564741",label:"国家中医药局项目"},{children:[],id:"921876375944564742",label:"中国科协"},{children:[],id:"921876375944564743",label:"北京市自然科学基金"},{children:[],id:"921876375944564744",label:"北京市教委"},{children:[],id:"921876375944564745",label:"北京市科协"},{children:[],id:"921876375948759040",label:"其他部委项目"}],id:"921876375944564736",label:"省部级"},{children:[{children:[],id:"921876375948759042",label:"其他"}],id:"921876375948759041",label:"其他"},{children:[{children:[],id:"921876375948759044",label:"与企业联合项目"}],id:"921876375948759043",label:"横向"}],id:"921876375923593216",label:"科研"}]},methods:{initPage:function(){var t=this;this.$http.get("/sys-dict/codes/SRCAT+PROST").then(function(e){var a=e.data;t.stateOptions=a.PROST,t.typeOptions=a.SRCAT,t.getTableData()}).catch(function(t){})},handleSelectionChange:function(t){this.multipleSelection=t},handleLeftClick:function(){},getUrl:function(){var t="";for(var e in this.searchData)t=(this.searchData[e],t+"/"+this.searchData[e]);return this.pageType+t},getTableData:function(){var t=this;this.$http.get("/srpms-outline/"+this.getUrl()+"/1").then(function(e){e.data.forEach(function(t){if(t.proCategory){var e=t.proCategory,a=e.substr(1,e.length-2);t.proCategory=a.split(",")}}),t.tableData=e.data||[]}).catch(function(t){})},formatterType:function(t){var e=this.allTypes.filter(function(e){return String(e.value)===String(t)});return e&&e.length?e[0].label:""},handleSearch:function(){this.getTableData()},handleValueChange:function(t){this.savedFlag=!1,-1===this.unsavedData.findIndex(function(e){return e===t})&&this.unsavedData.push(t)},getOrg:function(){var t=this,e="";return this.orgOptions.forEach(function(a){String(a.id)===t.titleData.orgId&&(e=a.label)}),e}},computed:{activeorgIdName:function(){var t=this,e=this.orgOptions.findIndex(function(e){return e.id===t.searchData.orgId});return-1!==e?this.orgOptions[e].label:""},exportTitle:function(){var t=this.titleData.year?this.titleData.year+"年":"",e=this.titleData.month?this.titleData.month+"月":"";return"确定导出："+this.getOrg()+t+e+"的模板?"}}}},g73v:function(t,e){},"l9D/":function(t,e,a){"use strict";var l={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("dt-scroll-box",[a("div",{attrs:{slot:"top"},slot:"top"},[a("div",{staticClass:"dt-page-top clearfix"},[a("span",{staticClass:"dt-bread-item"},[t._v("项目评审")])])]),t._v(" "),a("div",{attrs:{slot:"main-content"},slot:"main-content"},[a("div",{staticClass:"project-review-page"},[a("div",{staticClass:"search-box clearfix"},[a("div",{staticClass:"fl"},[a("div",{staticClass:"table-item pl0"},[a("div",{staticClass:"search-item"},[a("span",[t._v("项目名称：")]),t._v(" "),a("el-select",{staticClass:"dt-select",attrs:{clearable:"",placeholder:"请选择"},model:{value:t.searchData.orgId,callback:function(e){t.$set(t.searchData,"orgId",e)},expression:"searchData.orgId"}},t._l(t.orgOptions,function(t){return a("el-option",{key:t.id,attrs:{label:t.label,value:t.id}})}),1)],1),t._v(" "),a("div",{staticClass:"search-item"},[a("span",[t._v("姓名：")]),t._v(" "),a("el-input",{staticClass:"dt-input",attrs:{placeholder:"请输入"}})],1)]),t._v(" "),a("div",{staticClass:"pl80 table-item"},[a("div",{staticClass:"search-item"},[a("span",[t._v("项目类型：")]),t._v(" "),a("el-select",{staticClass:"dt-select",attrs:{clearable:"",placeholder:"请选择"},model:{value:t.searchData.year,callback:function(e){t.$set(t.searchData,"year",e)},expression:"searchData.year"}},t._l(t.yearOptions,function(t){return a("el-option",{key:t,attrs:{label:t+"年",value:t}})}),1)],1),t._v(" "),a("div",{staticClass:"search-item"},[a("span",[t._v("依托单位：")]),t._v(" "),a("el-input",{staticClass:"dt-input",attrs:{placeholder:"请输入"}})],1)]),t._v(" "),a("div",{staticClass:"pl80 table-item"},[a("div",{staticClass:"search-item"},[a("span",[t._v("项目状态：")]),t._v(" "),a("el-select",{staticClass:"dt-select",attrs:{clearable:"",placeholder:"请选择"},model:{value:t.searchData.month,callback:function(e){t.$set(t.searchData,"month",e)},expression:"searchData.month"}},t._l(12,function(t){return a("el-option",{key:t,attrs:{label:t+"月",value:t+""}})}),1)],1),t._v(" "),a("div",{staticClass:"search-item"},[a("span",[t._v("学科方向：")]),t._v(" "),a("el-input",{staticClass:"dt-input",attrs:{placeholder:"请输入"}})],1)])]),t._v(" "),a("div",{staticClass:"fr search-btn-box"},[a("el-button",{staticClass:"dt-btn",on:{click:t.handleSearch}},[a("i",{staticClass:"iconfont icons-chaxun"}),t._v("查询 ")]),t._v(" "),a("el-button",{staticClass:"dt-btn",staticStyle:{"margin-left":"20px"},on:{click:t.handleSearch}},[a("i",{staticClass:"iconfont icons-zhongzhi"}),t._v("重置 ")])],1)]),t._v(" "),a("el-table",{ref:"multipleTable",staticStyle:{width:"100%"},attrs:{data:t.tableData,"tooltip-effect":"dark","header-cell-style":{background:"#F9FAFC",color:"#696969",textAlign:"center"}},on:{"selection-change":t.handleSelectionChange}},[a("el-table-column",{attrs:{prop:"proNum","show-overflow-tooltip":"",label:"项目编号"}}),t._v(" "),a("el-table-column",{attrs:{prop:"proName","show-overflow-tooltip":"",label:"项目名称"}}),t._v(" "),a("el-table-column",{attrs:{prop:"proName","show-overflow-tooltip":"",label:"姓名"}}),t._v(" "),a("el-table-column",{attrs:{prop:"proName","show-overflow-tooltip":"",label:"依托单位"}}),t._v(" "),a("el-table-column",{attrs:{prop:"proName","show-overflow-tooltip":"",label:"项目类型"}}),t._v(" "),a("el-table-column",{attrs:{prop:"proName","show-overflow-tooltip":"",label:"申报编号"}}),t._v(" "),a("el-table-column",{attrs:{prop:"proName","show-overflow-tooltip":"",label:"学科方向"}}),t._v(" "),a("el-table-column",{attrs:{prop:"proName","show-overflow-tooltip":"",label:"项目状态"}}),t._v(" "),a("el-table-column",{attrs:{prop:"proName","show-overflow-tooltip":"",label:"评审意见"},scopedSlots:t._u([{key:"default",fn:function(e){return[a("span",{staticClass:"dt-txt-btn"},[t._v("评审")])]}}])})],1),t._v(" "),a("dt-dialog",{key:"1",attrs:{isShow:t.dialogShow,title:"有未保存的数据，确定继续操作？"},on:{"left-click":t.handleLeftClick,"right-click":function(e){t.dialogShow=!1}}})],1)])])},staticRenderFns:[]};e.a=l},lpC2:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var l=a("K1o+"),i=a.n(l);for(var n in l)"default"!==n&&function(t){a.d(e,t,function(){return l[t]})}(n);var s=a("l9D/");var r=function(t){a("g73v")},o=a("VU/8")(i.a,s.a,!1,r,null,null);e.default=o.exports}});
//# sourceMappingURL=18.b3d5bf951d7e6af30bfa.js.map