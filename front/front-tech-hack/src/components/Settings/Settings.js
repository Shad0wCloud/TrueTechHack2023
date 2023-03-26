import {IoMdSettings} from 'react-icons/io';

function Settings() {
    return (
        <div className="max-w-lg">
            <header className="flex items-center">
                <IoMdSettings size={43} color="white"/>
                <div className="uppercase text-[40px] text-white ml-4 font-semibold tracking-widest">Settings</div>
            </header>

            <div className="flex items-center mt-16">
                <div className="text-white  ">choice</div>


                    <div className="flex items-center ml-auto">
                        <div className="pr-3 flex items-center">
                        <div className="text-white  mr-3">preset1</div>
                        <input id="default-checkbox" type="checkbox" value=""
                               className="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 rounded focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600"/>
                        </div>
                        <div className="pl-3 flex items-center">
                            <div className="text-white  mr-3">preset2</div>
                            <input id="default-checkbox" type="checkbox" value=""
                                   className="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 rounded focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600"/>
                        </div>
                    </div>


            </div>
            <div>
                <div className="flex mt-6">
                    <div className="text-white  mr-12 w-20">setting 1</div>
                    <div className="relative flex flex-col ml-auto w-full">
                        <input type="range"/>
                        <div className="flex items-center mt-[-7px]">
                            <label  className="form-label text-[10px] text-white  font-semibold">0</label>
                            <label  className="form-label text-[10px]  text-white font-semibold ml-auto">100</label>
                        </div>
                    </div>
                </div>
                <div className="flex mt-3">
                    <div className="text-white  mr-12 w-20">setting 2</div>
                    <div className="relative flex flex-col ml-auto w-full">
                        <input type="range"/>
                        <div className="flex items-center mt-[-7px]">
                            <label  className="form-label text-[10px] text-white  font-semibold">0</label>
                            <label  className="form-label text-[10px]  text-white font-semibold ml-auto">100</label>
                        </div>
                    </div>
                </div>
                <div className="flex mt-3">
                    <div className="text-white  mr-12 w-20">setting 3</div>
                    <div className=" w-full">
                        <select id="countries"
                                className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-[10px] outline-none px-2 block w-full ">
                            <option selected>list</option>
                            <option >test</option>
                            <option >test</option>
                            <option >test</option>
                            <option >test</option>
                        </select>

                    </div>
                </div>
                <div className="flex mt-4">
                    <div className="text-white  mr-12 w-20">setting 4</div>
                    <div className="relative flex flex-col ml-auto w-full">
                        <input type="range"/>
                        <div className="flex items-center mt-[-7px]">
                            <label  className="form-label text-[10px] text-white  font-semibold">0</label>
                            <label  className="form-label text-[10px]  text-white font-semibold ml-auto">100</label>
                        </div>
                    </div>
                </div>
                <div className="flex mt-3">
                    <div className="text-white  mr-12 w-20">setting 5</div>
                    <div className="relative flex flex-col ml-auto w-full">
                        <input type="range"/>
                        <div className="flex items-center mt-[-7px]">
                            <label  className="form-label text-[10px] text-white  font-semibold">0</label>
                            <label  className="form-label text-[10px]  text-white font-semibold ml-auto">100</label>
                        </div>
                    </div>
                </div>

            </div>
            <div className="flex items-center justify-center mt-24 pb-8">
                <button className="bg-[#EB455F]  text-white font-bold py-2 font-medium px-10 rounded-[10px]">
                    save settings
                </button>
            </div>
        </div>
    );
}

export default Settings;
