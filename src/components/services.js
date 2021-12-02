import '../styles/Services.css';

import React from 'react';

function Services(){
    return(
        <div className="Services container">
            <h6>services</h6>
            <h3>What I Am Good At</h3>
            <br />
            <div className="sevices-icons row">
                <div className="images col-sm">
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWUKxiKllG_bBjh_EBbNOuaLTdB8-WRyTHdQ&usqp=CAU" alt="" />
                <p>Design</p>
                </div>
                <div className="images col-sm">
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqUVQrorTQ-bwPHMrCLlHrmmRCY9tL6a99tA&usqp=CAU" alt="" />
                <p>Web Developement</p>
                </div>
                <div className="images col-sm">
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtCEefNLhP8FjtkjCbU9CQOZgN0vYkdprwjQ&usqp=CAU" alt=""  />
                <p>Android Developement</p>
                </div>
                
            </div>

            
    
        </div>
    )
}
export default Services;