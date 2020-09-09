import React from "react";

function Card(props){
return(

<div>
<img src={props.img} />
<h2>{props.name}</h2>
<h2>{props.email}</h2>
</div>
)
}

export default Card;
