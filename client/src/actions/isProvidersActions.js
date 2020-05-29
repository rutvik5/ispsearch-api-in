import isProviders from '../data/isProviders';

export const GET_ISPROVIDERS = 'GET ISPROVIDERS';
export const GET_ISPROVIDERS_SUCCESS = 'GET_ISPROVIDERS_SUCCESS';
export const GET_ISPROVIDERS_FAILURE = 'GET_ISPROVIDERS_FAILURE';

export const getIsProviders = () => ({
    type: GET_ISPROVIDERS,
});

export const getIsProvidersSuccess = isProviders => ({
    type: GET_ISPROVIDERS_SUCCESS,
    payload: isProviders,
});

export const getIsProvidersFailure = () => ({
    type: GET_ISPROVIDERS_FAILURE
});

export function fetchIsProviders() {
    return async dispatch => {
        dispatch(getIsProviders());
        try {
            // const response = await fetch('https://jsonplaceholder.typicode.com/posts');
            // const data = await response.json();
            dispatch(getIsProvidersSuccess(isProviders));
        } catch {
            dispatch(getIsProvidersFailure());
        }
    }
}