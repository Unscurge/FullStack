import React from 'react';
import './EmailList.css'
import { Checkbox,IconButton} from "@mui/material";
import ArrowDropDownIcon from '@mui/icons-material/ArrowDropDown';
import RedoIcon from '@mui/icons-material/Redo';    
import MoreVertIcon from '@mui/icons-material/MoreVert';
import ChevronLeftIcon from '@mui/icons-material/ChevronLeft';
import ChevronRightIcon from '@mui/icons-material/ChevronRight';
import KeyboardHideIcon from '@mui/icons-material/KeyboardHide';
import SettingsIcon from '@mui/icons-material/Settings';
import InboxIcon from '@mui/icons-material/Inbox';
import PeopleIcon from '@mui/icons-material/People';
import LocalOfferIcon from '@mui/icons-material/LocalOffer';
import Section from './Section';
import Emailrow from './Emailrow';


function EmailList() {
    return (
        <div className='emailList'>
            <div className='emailList_settings'>
                <div className='emailList_settingsLeft'>
                    <Checkbox />
                    <IconButton>
                        <ArrowDropDownIcon/>
                    </IconButton>
                    <IconButton>
                        <RedoIcon/>
                    </IconButton>
                    <IconButton>
                        <MoreVertIcon/> 
                    </IconButton>
                </div>
                <div className='emailList_settingsRight'>
                    <IconButton>
                        <ChevronLeftIcon/> 
                    </IconButton>
                    <IconButton>
                        <ChevronRightIcon/> 
                    </IconButton>
                    <IconButton>
                        <KeyboardHideIcon/> 
                    </IconButton>
                    <IconButton>
                        <SettingsIcon/> 
                    </IconButton>
                </div>
            </div>
            <div className='emailList_sections'>
                <Section Icon={InboxIcon} title="Primary" color="red" selected />
                <Section Icon={PeopleIcon} title="Social" color="#1A73E8"/>
                <Section Icon={LocalOfferIcon} title="Promotions" color="green" />
            </div>
            <div className='emailList_list'>
                <Emailrow title="React" subject="Gmail-CLone" description="This is a Gmail wannabe" time="12pm" />
            </div>
        </div>
    )
}

export default EmailList;