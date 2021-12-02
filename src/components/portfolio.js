import '../styles/portfolio.css';
import Button from 'react-bootstrap/Button';
import 'bootstrap/dist/css/bootstrap.min.css';

import React from 'react';


import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Designs from './Designs';
import Websites from './websites';
import AndroidApps from './AndroidApps';

function Portfolio(){
    return(
        
            <div className="Portfolio">
            <h6>Portfolio</h6>
            <br /><br />
            <div className="portfolio">
                <div className="container">
                    <div className="row">
                   
                    <Button variant="outline-success col-sm" Link to="/designs">Designs</Button>
                    <Button variant="outline-success col-sm" Link to="/websites">Websites</Button>
                    <Button variant="outline-success col-sm" Link to="/Android-Apps">Android Apps</Button>
                    
                    </div>
                </div>
                
                <br/><br/>
                <div className="Android container">
                <h6>Sample Android Apps</h6>
                <br /><br />
                <div className="sevices-icons row">
                    <div className="images col-sm">
                    <img src="https://i.pinimg.com/236x/10/0d/65/100d65c37603d811de9a1413f083c7a7.jpg" alt="" />
                    <p>App Name</p>
                    </div>
                    <div className="images col-sm">
                    <img src="https://i.pinimg.com/236x/10/0d/65/100d65c37603d811de9a1413f083c7a7.jpg" alt="" />
                    <p>App Name</p>
                    </div>
                    <div className="images col-sm">
                    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtCEefNLhP8FjtkjCbU9CQOZgN0vYkdprwjQ&usqp=CAU" alt="" />
                    <p>App Name</p>
                    </div>
                
            </div>
                </div>
            

            </div>
        </div>
        
        
       
    );
}
export default Portfolio;