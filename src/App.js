
import './App.css';
import Home from './components/home';
import Navbar from './components/navbar';
import Services from './components/services';
import Skills from './components/skills';
import 'bootstrap/dist/css/bootstrap.css';
import Portfolio from './components/portfolio';
import Contact from './components/contact';

import AndroidApps from './components/AndroidApps';
import Designs from './components/Designs';
import Websites from './components/websites';
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";



function App() {
  return (
    <Router>
        <div className="App">
      <div className="section1">
         <Navbar />
      </div>
      
      <div className="section2">
        <Home />
      </div>
      <div className="section3">
        <Services />
      </div>
      <div className="section4">
        <Skills />
      </div>
      <div className="section5">
        <Portfolio />
      </div>
      <div className="section6">
        <Contact />
      </div>
    </div>

                 <Routes>
                    <Route exact path="/designs" element={<Designs/>} />
                    <Route exact path="/Websites"element={<Websites/>}/>
                    <Route exact path="/Android-Apps" element={<AndroidApps/>} />
                 </Routes>

                 <button variant="outline-success col-sm" Link to="/designs">Designs</button>
                    <button variant="outline-success col-sm" Link to="/websites">Websites</button>
                    <button variant="outline-success col-sm" Link to="/Android-Apps">Android Apps</button>
    </Router>
    
  );
}

export default App;
