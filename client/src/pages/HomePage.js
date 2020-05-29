import React, { useEffect } from 'react';
import { connect } from 'react-redux';

import { fetchIsProviders } from '../actions/isProvidersActions';
import ISProvider from '../components/ISProvider';

const HomePage = ({ dispatch, loading, isProviders, hasErrors }) => {
    useEffect(() => {
        dispatch(fetchIsProviders())
    }, [dispatch])

    const renderISP = () => {
        if (loading) return <p>Loading ISPs...</p>
        if (hasErrors) return <p>Unable to get ISPs...</p>
        return isProviders.map(isProvider => <ISProvider key={isProvider.id} isProvider={isProvider} />)
    }

    return (
        <div>
            <h1>ISP Search Home Page</h1>
            {renderISP()}
        </div>   
    )
}

const mapStateToProps = state => ({
    loading: state.isProviders.loading,
    isProviders: state.isProviders.isProviders,
    hasErrors: state.isProviders.hasErrors,
})

export default connect(mapStateToProps)(HomePage)