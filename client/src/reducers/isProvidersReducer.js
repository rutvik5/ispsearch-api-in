import * as actions from '../actions/isProvidersActions';

export const initialState = {
    isProviders: [],
    loading: false,
    hasErrors: false,
}

export default function isProvidersReducer(state = initialState, action) {
    switch (action.type) {
        case actions.GET_ISPROVIDERS:
            return { ...state, loading: true }
        case actions.GET_ISPROVIDERS_SUCCESS:
            return { isProviders: action.payload, loading: false, hasErrors: false }
        case actions.GET_ISPROVIDERS_FAILURE:
            return { ...state, loading: false, hasErrors: true }
        default:
            return state
    }
}