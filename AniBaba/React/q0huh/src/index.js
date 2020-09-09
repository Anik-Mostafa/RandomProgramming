import React from "react";
import ReactDOM from "react-dom";
import pi, { dPi, tPi } from "./math";
import Header from "./header";
import Card from "./card";


// import * as pi from "./math";
// import {a,s,m,d} from "./calculator"

const rootElement = document.getElementById("root");
ReactDOM.render(
  <div>
<Header />
<Card img="https://gmsrp.cachefly.net/images/18/08/22/0dadc1d1bed46153a6ed1e1ef04bd23a/960.jpg" name="Roman Reigns"  email="romanreigns@wwe.com" />
<Card img="https://www.wwe.com/f/styles/gallery_img_l/public/all/2019/02/018_SD_02192019cm_1196--dbbd1a5f3550410cb43619663040be4f.jpg" name="Aleister Black"  email="aleisterblack@wwe.com" />



  </div>,
  rootElement
);
