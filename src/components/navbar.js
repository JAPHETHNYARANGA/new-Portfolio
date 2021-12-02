import "../styles/navbar.css";

import React from 'react';

function Navbar(){
    return(
        <div className="navbar">
            <ul>
            <li>Contact</li>
                <li>Portfolio</li>
                <li>Skills</li>
                <li>Services</li>
                <li>Home</li>    
            </ul>
        </div>
    )
}

export default Navbar;