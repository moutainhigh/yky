webpackJsonp([35],{"5z0s":function(t,l){},AQAt:function(t,l,e){"use strict";Object.defineProperty(l,"__esModule",{value:!0});var i=d(e("Yyxw")),a=d(e("ydqC")),n=d(e("MAY9"));function d(t){return t&&t.__esModule?t:{default:t}}l.default={name:"demo",components:{DtDialog:i.default,DtTextarea:a.default,DtTextareaSign:n.default},data:function(){return{dialogShow:!1,dialogShow2:!1,dialogShow3:!1,defaultProps:{children:"children",label:"label"},signText1:"已对申请人的资格和申报书的内容进行了审核。申请项目如获资助，我单位保证对研究计划所需要的人力、物力和工作时间等条件给予保障,严格遵守国家和中国医学科学院有关规定，督促项目负责人和项目组成员按照规定及时报送给有关材料",textarea:"",data:[{children:[{children:[{children:[],id:"921876375923593218",label:"创新工程"},{children:[],id:"921876375927787520",label:"院基科费"},{children:[],id:"921876375931981824",label:"校基科费"},{children:[],id:"921876375931981825",label:"改革经费"}],id:"921876375923593217",label:"院校级"},{children:[{children:[],id:"921876375931981827",label:"国家科技重大专项"},{children:[],id:"921876375931981828",label:"国家重点研发计划项目"},{children:[],id:"921876375936176128",label:"技术创新引导专项"},{children:[],id:"921876375936176129",label:"重大科学计划"},{children:[],id:"921876375936176130",label:"科技支撑计划"},{children:[],id:"921876375940370432",label:"973计划"},{children:[],id:"921876375940370433",label:"863计划"},{children:[],id:"921876375940370434",label:"基地和人才专项"},{children:[],id:"921876375940370435",label:"基础条件平台"},{children:[],id:"921876375940370436",label:"国际合作项目(科技部)"},{children:[],id:"921876375940370437",label:"其他计划项目"},{children:[],id:"921876375940370438",label:"国家自然科学基金项目"},{children:[],id:"921876375940370439",label:"国家社会科学基金项目"}],id:"921876375931981826",label:"国家级"},{children:[{children:[],id:"921876375944564737",label:"国家卫生健康委项目"},{children:[],id:"921876375944564738",label:"教育部项目"},{children:[],id:"921876375944564739",label:"国家发改委项目"},{children:[],id:"921876375944564740",label:"国家药监局项目"},{children:[],id:"921876375944564741",label:"国家中医药局项目"},{children:[],id:"921876375944564742",label:"中国科协"},{children:[],id:"921876375944564743",label:"北京市自然科学基金"},{children:[],id:"921876375944564744",label:"北京市教委"},{children:[],id:"921876375944564745",label:"北京市科协"},{children:[],id:"921876375948759040",label:"其他部委项目"}],id:"921876375944564736",label:"省部级"},{children:[{children:[],id:"921876375948759042",label:"其他"}],id:"921876375948759041",label:"其他"},{children:[{children:[],id:"921876375948759044",label:"与企业联合项目"}],id:"921876375948759043",label:"横向"}],id:"921876375923593216",label:"科研"}]}},methods:{handleLeftClick:function(){console.log("点击了左边按钮")},handleRightClick:function(){console.log("点击了右边按钮"),this.dialogShow=!1,this.dialogShow2=!1,this.dialogShow3=!1},handleNodeClick:function(){},handleChange:function(t){console.log(this.textarea)}}}},MguH:function(t,l,e){"use strict";Object.defineProperty(l,"__esModule",{value:!0});var i=e("AQAt"),a=e.n(i);for(var n in i)"default"!==n&&function(t){e.d(l,t,function(){return i[t]})}(n);var d=e("ZAQD");var c=function(t){e("5z0s")},s=e("VU/8")(a.a,d.a,!1,c,null,null);l.default=s.exports},ZAQD:function(t,l,e){"use strict";var i={render:function(){var t=this,l=t.$createElement,e=t._self._c||l;return e("div",{staticClass:"demo-page"},[e("p",[t._v("1.按钮")]),t._v(" "),e("div",[e("el-button",{staticClass:"dt-btn"},[e("i",{staticClass:"iconfont icon-shanchu"}),t._v("查询 ")]),t._v(" "),e("el-button",{staticClass:"dt-btn"},[t._v("导入模板 ")]),t._v(" "),e("el-button",{staticClass:"dt-btn br18"},[t._v("确定 ")]),t._v(" "),e("span",{staticClass:"dt-txt-btn",staticStyle:{"margin-left":"20px"}},[t._v("申请")]),t._v(" "),t._m(0),t._v(" "),t._m(1),t._v(" "),t._m(2),t._v(" "),t._m(3)],1),t._v(" "),e("p",[t._v("2.输入框")]),t._v(" "),e("div",[e("el-input",{staticClass:"dt-input",attrs:{placeholder:"请输入"}}),t._v(" "),e("dt-textarea",{staticStyle:{"margin-top":"20px"},attrs:{value:t.textarea,maxNumber:2e3},on:{"update:value":function(l){t.textarea=l}}}),t._v(" "),e("dt-textarea-sign",{staticStyle:{"margin-top":"20px"},attrs:{value:t.signText1,signLabel:["单位公章","法定代表人签字"]},on:{"update:value":function(l){t.signText1=l}}})],1),t._v(" "),e("p",[t._v("3.弹窗")]),t._v(" "),e("div",[e("el-button",{staticClass:"dt-btn",on:{click:function(l){t.dialogShow=!0}}},[t._v("点我查看 ")]),t._v(" "),e("el-button",{staticClass:"dt-btn",on:{click:function(l){t.dialogShow2=!0}}},[t._v("样式二 ")]),t._v(" "),e("el-button",{staticClass:"dt-btn",on:{click:function(l){t.dialogShow3=!0}}},[t._v("样式三 ")])],1),t._v(" "),e("p",[t._v("3.树形结构")]),t._v(" "),e("el-tree",{attrs:{data:t.data,props:t.defaultProps},on:{"node-click":t.handleNodeClick}}),t._v(" "),e("dt-dialog",{key:"1",attrs:{isShow:t.dialogShow,title:"是否导入"},on:{"left-click":t.handleLeftClick,"right-click":t.handleRightClick}}),t._v(" "),e("dt-dialog",{key:"2",attrs:{isShow:t.dialogShow2,title:"是否生成PDF",hasContent:!0},on:{"left-click":t.handleLeftClick,"right-click":t.handleRightClick}},[e("div",{staticStyle:{"margin-bottom":"20px"}},[t._v("请选择PDF生成路径，是否生成PDF？")])]),t._v(" "),e("dt-dialog",{key:"3",attrs:{hasContent:!0,isShow:t.dialogShow3,hasBtn:!1,title:"填写说明"}},[e("p",{staticStyle:{width:"427px","font-size":"14px","font-weight":"normal","margin-bottom":"20px"}},[t._v("在这个例子里，因为父组件在里面写了HTML模板，子那么组件的匿名来自插槽这块模板就是下面这样。也就是说，子组件的匿名插槽被使用了，是被下面这块模板使用了。在这个例子里，因为父组件在里面写了HTML模板，子那么组件的匿名来自插槽这块模板就是下面这样。也就是说，子组件的匿名插槽被使用了，是被下面这块模板使用了。在这个例子里，因为父组件在里面写了HTML模板，子那么组件的匿名来自插槽这块模板就是下面这样。也就是说，子组件的匿名插槽被使用了，是被下面这块模板使用了。在这个例子里，因为父组件在里面写了HTML模板，子那么组件的匿名来自插槽这块模板就是下面这样。也就是说，子组件的匿名插槽被使用了，是被下面这块模板使用了。在这个例子里，因为父组件在里面写了HTML模板，子那么组件的匿名来自插槽这块模板就是下面这样。也就是说，子组件的匿名插槽被使用了，是被下面这块模板使用了。")]),t._v(" "),e("div",{staticStyle:{"text-align":"center"}},[e("el-button",{staticClass:"dt-btn br18 hover",on:{click:function(l){t.dialogShow3=!1}}},[t._v("关闭")])],1)])],1)},staticRenderFns:[function(){var t=this.$createElement,l=this._self._c||t;return l("span",{staticClass:"dt-square-btn",staticStyle:{"margin-left":"20px"}},[l("i",{staticClass:"el-icon-plus"})])},function(){var t=this.$createElement,l=this._self._c||t;return l("span",{staticClass:"dt-square-btn",staticStyle:{"margin-left":"20px"}},[l("i",{staticClass:"el-icon-minus"})])},function(){var t=this.$createElement,l=this._self._c||t;return l("span",{staticClass:"dt-square-btn mini",staticStyle:{"margin-left":"20px"}},[l("i",{staticClass:"el-icon-plus"})])},function(){var t=this.$createElement,l=this._self._c||t;return l("span",{staticClass:"dt-square-btn mini",staticStyle:{"margin-left":"20px"}},[l("i",{staticClass:"el-icon-minus"})])}]};l.a=i}});
//# sourceMappingURL=35.622166ea106e98208cb4.js.map