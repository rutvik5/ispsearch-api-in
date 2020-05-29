import React from 'react';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';

import NavigationBar from './components/NavigationBar';
import HomePage from './pages/HomePage';
import RegisterPage from './pages/RegisterPage';
import SignInPage from './pages/SignInPage';
import AboutPage from './pages/AboutPage';

const App = () => {
    return (
        <div>
            <NavigationBar />
            <Router>
                <Switch>
                    <Route exact path="/" component={HomePage} />
                    <Route exact path="/register" component={RegisterPage} />
                    <Route exact path="/signin" component={SignInPage} />
                    <Route exact path="/about" component={AboutPage} />
                </Switch>
            </Router>
        </div>

    )
}

export default App;