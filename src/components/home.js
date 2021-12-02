import '../styles/Home.css';
import Button from 'react-bootstrap/Button';
import 'bootstrap/dist/css/bootstrap.min.css';

import React from 'react';

function Home(){
    return(
        <div className="Home container">
            <div className="row">
            <div className="Name col-sm">
                <h4>Japheth <br/> Nyaranga</h4>
                <br/>
               
                <Button variant="outline-success">Download Resume</Button>
                <br /><br />
            </div>
            <div className="Avatar col-sm">
                <img src="https://chingizpro.github.io/portfolio/img/person.png" alt="developer"className="home-img" />
            </div>
            <div className="Description col-sm">
                <h4>UI/UX Designer<br/>Android Developer<br/>Website Developer</h4>
            </div>
            </div>
            
        </div>
    )
}

export default Home;