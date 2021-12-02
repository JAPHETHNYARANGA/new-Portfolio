import '../styles/skills.css';

import React from 'react';



function Skills(){
    return(
            <div className="container">
            <div className="skills row" >
            <div className="Design col-sm center">
                <h5>Design</h5>
                <p>Figma</p>
                <p>Gimp</p>
            </div>
            <div className="Website col-sm center">
                <h5>Website</h5>
                <p>React</p>
                <p>Angular</p>
                <p>Bootstrap</p>
                <p>Javascript</p>
            </div>
            <div className="Android col-sm center">
                <h5>Android</h5>
                <p>Android</p>
                <p>Java</p>
                
            </div>
            <div className="Developer-Tools col-sm center">
                <h5>Developer Tools</h5>
                <p>Github</p>
                <p>Gitlab</p>
                <p>Click Up</p>
            </div>
            
        </div>
      

            </div>
                
        
    )
}
export default Skills;