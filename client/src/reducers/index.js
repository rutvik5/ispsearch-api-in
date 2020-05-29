import { combineReducers } from 'redux';

import isProvidersReducer from './isProvidersReducer';

const rootReducer = combineReducers({
    isProviders: isProvidersReducer,
});

export default rootReducer;