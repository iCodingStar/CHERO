import React, {StyleSheet, Dimensions, PixelRatio} from "react-native";
const {width, height, scale} = Dimensions.get("window"),
    vw = width / 100,
    vh = height / 100,
    vmin = Math.min(vw, vh),
    vmax = Math.max(vw, vh);

export default StyleSheet.create({
    "cbp-fwslider": {
        "position": "relative",
        "overflow": "hidden",
        "paddingTop": 11,
        "paddingRight": 0,
        "paddingBottom": 0,
        "paddingLeft": 0
    },
    "cbp-fwslider ul": {
        "marginTop": 0,
        "marginRight": 0,
        "marginBottom": 0,
        "marginLeft": 0,
        "paddingTop": 0,
        "paddingRight": 0,
        "paddingBottom": 0,
        "paddingLeft": 0,
        "whiteSpace": "nowrap",
        "listStyleType": "none"
    },
    "cbp-fwslider ul li": {
        "WebkitTransform": "translateZ(0)",
        "MozTransform": "translateZ(0)",
        "transform": "translateZ(0)",
        "float": "left",
        "display": "block",
        "marginTop": 0,
        "marginRight": 0,
        "marginBottom": 0,
        "marginLeft": 0,
        "paddingTop": 0,
        "paddingRight": 0,
        "paddingBottom": 0,
        "paddingLeft": 0
    },
    "cbp-fwslider ul li > a": {
        "display": "block",
        "textAlign": "center",
        "outline": "none"
    },
    "cbp-fwslider ul li > div": {
        "display": "block",
        "textAlign": "center",
        "outline": "none"
    },
    "cbp-fwslider ul li > a img": {
        "border": "none",
        "display": "block",
        "marginTop": 0,
        "marginRight": "auto",
        "marginBottom": 0,
        "marginLeft": "auto",
        "maxWidth": "32%"
    },
    "cbp-fwslider nav span": {
        "position": "absolute",
        "top": "57%",
        "height": 70,
        "width": 40,
        "background": "transparent url(\"../images/arrows.png\") no-repeat 0px 0px",
        "color": "#fff",
        "fontSize": 50,
        "textAlign": "center",
        "marginTop": -50,
        "lineHeight": 100,
        "cursor": "pointer",
        "fontWeight": "normal"
    },
    "cbp-fwslider nav spancbp-fwnext": {
        "backgroundPosition": "right top",
        "right": 0
    },
    "cbp-fwslider nav spancbp-fwprev": {
        "backgroundPosition": "left top",
        "left": 0
    },
    "spancbp-fwprev": {
        "display": "none important!"
    },
    "spancbp-fwnext": {
        "display": "none important!"
    },
    "cbp-fwdots": {
        "position": "absolute",
        "bottom": 30,
        "whiteSpace": "nowrap",
        "textAlign": "center",
        "width": "100%",
        "display": "none"
    },
    "cbp-fwdots span": {
        "display": "inline-block",
        "width": 18,
        "height": 18,
        "background": "rgba(39, 40, 40, 0.74)",
        "marginTop": 4,
        "marginRight": 4,
        "marginBottom": 4,
        "marginLeft": 4,
        "borderRadius": "50%",
        "OBorderRadius": "50%",
        "WebkitBorderRadius": "50%",
        "MozBorderRadius": "50%",
        "MsborderRadius": "50%",
        "cursor": "pointer"
    },
    "cbp-fwdots span:hover": {
        "background": "rgba(39, 40, 40, 0.74)"
    },
    "cbp-fwdots spancbp-fwcurrent": {
        "background": "#ff1791",
        "boxShadow": "0 0 0 2px #ff1791",
        "WebkitTransition": "box-shadow 0.2s ease-in-out",
        "MozTransition": "box-shadow 0.2s ease-in-out",
        "transition": "box-shadow 0.2s ease-in-out"
    }
});