//External Imports
import React from 'react';
import { render } from 'react-dom';
import { Provider } from 'react-redux';

//Internal Imports
import App from './App';
import store from './store';

//Assets
import './index.css';

const root = (
    <Provider store={store}>
        <App />
    </Provider>
);

render(root, document.getElementById('root'));