import React from 'react';
import {
    Navbar,
    NavbarBrand,
    Nav,
    NavItem,
    NavLink
} from 'reactstrap';

const NavigationBar = (props) => {
    return (
        <div>
            <Navbar color="light" light expand="md">
                <NavbarBrand href="/">ISP Search API</NavbarBrand>
                <Nav className="mr-auto" navbar>
                    <NavItem>
                        <NavLink href="/about">About</NavLink>
                        <NavLink href="/register">Register</NavLink>
                        <NavLink href="/signin">Sign In</NavLink>
                    </NavItem>
                </Nav>
            </Navbar>
        </div>
    )
}

export default NavigationBar;